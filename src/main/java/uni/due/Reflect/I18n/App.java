package uni.due.Reflect.I18n;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;


public class App {


    public static void say(){
        Properties pro = new Properties();

        //获取config.properties路径,随着程序编译运行,放在classes path的根路径下
        //需要将resources/properties添加到项目build path当中
        String configPath=App.class.getResource("/config.properties").getPath();
        System.out.println(configPath + " : 第一次编码");
        try {
            configPath = new URLDecoder().decode(configPath,"UTF-8"); //将其还原成为标准路径 不包含特殊编码(中文和空格)的文件路径
            System.out.println(configPath + " : 第二次编码");

            pro.load(new FileInputStream(configPath));
            String lan = pro.getProperty("language-cn"); //只需要修改传入的String参数即可修改实例化对象

            Internationalization i18= (Internationalization) Class.forName(lan).newInstance();
            System.out.println(i18.say());

            lan = pro.getProperty("language-en");

            i18= (Internationalization) Class.forName(lan).newInstance();
            System.out.println(i18.say());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        App.say();
    }
}

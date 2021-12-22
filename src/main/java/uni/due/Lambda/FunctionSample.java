package uni.due.Lambda;


import java.util.Random;
import java.util.function.Function;

/*
* Function<T,R>接口使用
*
* @param:T input
* @param:R output
*
* @return:R
* */
public class FunctionSample {


    public static void main(String[] args) {

        //生成随机定长String
        Function<Integer,String> randomStringFunction = l->{
            String chars="abcdefghijklmnopqrstuvwsyz0123456789";
            StringBuffer stringBuffer = new StringBuffer();
            Random random = new Random();
            for(int i=0;i<l;i++)
            {
                int position  = random.nextInt(chars.length()); //随机数范围为chars长度
                stringBuffer.append(chars.charAt(position));
            }
            return stringBuffer.toString();
        };

        String result = randomStringFunction.apply(6);
        System.out.println(result);
    }
}

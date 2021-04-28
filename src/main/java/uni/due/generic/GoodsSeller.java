package uni.due.generic;

import java.util.List;

public class GoodsSeller {

    //Generic as parameter
    public void sellGoods(List<? extends Goods> list) {
        for (Goods s : list)
        {
            s.sell();
        }
    }
}

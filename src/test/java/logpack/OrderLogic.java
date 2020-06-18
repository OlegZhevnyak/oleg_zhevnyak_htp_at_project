package logpack;


import org.apache.log4j.Logger;

public class OrderLogic {

    private static final Logger log = Logger.getLogger(OrderLogic.class);

    public void doOrder(){
        System.out.println("Заказ оформлне!");
        System.out.println("Товар добавлен в корзну");
        log.info("Info MSG!");

    }

    public void addToCart(){
        System.out.println("Order added to cart!!");
        log.error("Error MSG!");
        log.debug("Get name of the second hotel from the wish list.\n " +
                "Name of the second hotel xPath: //li[2][@class='bui-carousel__item']//*[@class='bui-card__header']//a");
    }

}

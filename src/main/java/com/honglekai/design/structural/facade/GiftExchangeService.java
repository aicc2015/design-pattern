package com.honglekai.design.structural.facade;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/15 10:03
 * modifyTime
 */
public class GiftExchangeService {


    private QualifyService qualifyService = new QualifyService();

    private PaymentService paymentService = new PaymentService();

    private ShippingService shippingService = new ShippingService();

   /* public QualifyService getQualifyService() {
        return qualifyService;
    }

    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public ShippingService getShippingService() {
        return shippingService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }*/

    public void giftExchage(PointsGift pointsGift){

        //校验系统
        if(qualifyService.isAvalible(pointsGift)){
            //支付系统
            if (paymentService.pay(pointsGift)){
                //物流系统
                String orderNo = shippingService.getShippingNo(pointsGift);
                System.out.println(orderNo);
            }
        }
    }
}

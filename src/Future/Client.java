package Future;

/**
 * Created by lyl on 2017/4/28.
 */
public class Client {

    public Data request(final String queryStr){
        final FutureData futureData = new FutureData();
        new Thread(new Runnable() {
            @Override
            public void run() {
                RealData realData = new RealData(queryStr);
                futureData.setRealData(realData);
            }
        }).start();
        return futureData;
    }

    public static void main(String[] args) {
        Client client = new Client();
        Data data = client.request("name");
        System.out.println("请求完毕");
        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }
        System.out.println("数据等于 = ");
        System.out.println("数据等于 = "  +  data.getResult());
    }

}

package Future_1;

/**
 * Created by lyl on 2017/4/28.
 */
public class RealData implements Data {

    protected final String result;

    public RealData(String data){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10; i++){
            sb.append(data);
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
        result = sb.toString();
    }

    @Override
    public String getResult() {
        return result;
    }
}

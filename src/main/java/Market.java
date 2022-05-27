public class Market implements Cash {


    @Override
    public int payCash(int itog, int cash) {
        int result = cash - itog;
        return result;
    }
}

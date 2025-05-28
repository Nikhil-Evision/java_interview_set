package singleton;

public class BillPughSolution {

    private BillPughSolution(){}

    private static class BillPughSolutionHelper{
        private static final BillPughSolution singletonObj = new BillPughSolution();
    }

    public static BillPughSolution getInstance(){
        return BillPughSolution.getInstance();
    }
}

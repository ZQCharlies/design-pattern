package design.bridge;

/**
 * @Author: wzq
 * @Date: 2022/7/26
 * @Desc: 桥接类的子类
 **/
public class FoldedPhone extends AbstractPhone{

    public FoldedPhone(IBrand iBrand) {
        super(iBrand);
    }

    public void open() {
        super.open();
    }
    public void close() {
        super.close();
    }
    public void call() {
        super.call();
    }

}

package design.observable;

/**
 * @Author: wzq
 * @Date: 2022/8/17
 * @Desc: 具体观察者2
 **/
public class ConcreteObserverTwo implements Observer{

    @Override
    public void update(String message) {
        System.out.println("observer two is notified.");
    }
}

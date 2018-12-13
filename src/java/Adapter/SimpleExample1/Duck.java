package Adapter.SimpleExample1;
//适配器模式主要是对原来的对象构造适配器对象，通过适配器将原来的对象包装起来，适配器实现接口方法，其方法内部实现是通过调用原来的类
public interface Duck {    //鸭子的接口
    public void quack();
    public void fly();
}

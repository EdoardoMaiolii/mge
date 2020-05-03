package control;

import model.DrawGraph;
import model.DrawGraphImpl;
import view.DrawGraphView;
import view.DrawGraphViewImpl;

public class DrawGraphApp implements DrawGraphViewObserver{

  private final DrawGraph model;
  private final DrawGraphView view;
  
  public DrawGraphApp() {
    this.model = new DrawGraphImpl();
    this.view = new DrawGraphViewImpl();
    this.view.setObserver(this);
    this.view.start();
  }
  
  @Override
  public void newGraph(String function, String max, String min, String rate) {
    // TODO Auto-generated method stub
    
  }
  
  public static void main(String[] args) {
    new DrawGraphApp();
  }

}

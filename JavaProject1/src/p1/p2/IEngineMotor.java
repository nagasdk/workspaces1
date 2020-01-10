package p1.p2;

public interface IEngineMotor {
   int getSpeed();
   int getMileage();
   int startEngine(int key);
  void showSpecifications();
  int getSpeed(int min, int max);
}



public interface IEngineMotor {
   int getSpeed();
   int getMileage();
   int startEngine(int key);
  void showSpecifications();
  int getSpeed(int min, int max);
}

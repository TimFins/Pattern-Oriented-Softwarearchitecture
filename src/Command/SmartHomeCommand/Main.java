package Command.SmartHomeCommand;

public class Main {
    public static void main(String[] args) {
        Heating kitchenHeating = new Heating("Kitchen");

        Light kitchenLight = new Light("Kitchen");

        Command kitchenHeatingTwentyDegree = new SetHeatingDegreeCommand(kitchenHeating, 20);
        Command kitchenHeatingTwentyFiveDegree = new SetHeatingDegreeCommand(kitchenHeating, 25);

        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);

        CommandComposition enterKitchen = new CommandComposition();
        enterKitchen.addCommand(kitchenHeatingTwentyFiveDegree);
        enterKitchen.addCommand(kitchenLightOn);

        enterKitchen.doCommand();
        enterKitchen.undoCommand();

        CommandComposition leaveKitchen = new CommandComposition();
        leaveKitchen.addCommand(kitchenHeatingTwentyDegree);
        leaveKitchen.addCommand(kitchenLightOff);

        leaveKitchen.doCommand();
        leaveKitchen.undoCommand();
    }
}

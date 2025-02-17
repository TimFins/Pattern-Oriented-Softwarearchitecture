package Command.SmartHomeCommand;

public class SetHeatingDegreeCommand implements Command {
    public Heating heating;
    public double heatToSet;

    public double previousHeat;

    public SetHeatingDegreeCommand(Heating heating, double heatToSet) {
        this.heating = heating;
        this.heatToSet = heatToSet;
    }

    @Override
    public void doCommand() {
        this.previousHeat = heating.heat;

        heating.setHeat(this.heatToSet);
    }

    @Override
    public void undoCommand() {
        heating.setHeat(previousHeat);
    }
}

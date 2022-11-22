package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    private Bulldozer bulldozer1 = new Bulldozer("Bulldozer1", "green");
    private Bulldozer bulldozer2 = new Bulldozer("Bulldozer2", "grey");
    private Bulldozer bulldozer3 = new Bulldozer("Bulldozer3", "yellow");
    private List<Bulldozer> bulldozers = List.of(bulldozer1, bulldozer2, bulldozer3);

    @Override
    public List<? extends Machine> get() {
        return bulldozers;
    }
}

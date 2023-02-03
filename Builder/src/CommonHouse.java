public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        house.setBasic("普通地基");
    }

    @Override
    public void buildWalls() {
        house.setWalls("普通墙壁");
    }

    @Override
    public void buildRoof() {
        house.setRoof("普通房顶");
    }
}

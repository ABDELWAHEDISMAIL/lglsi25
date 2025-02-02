public class Test{
    public static void main(String[] args) {
        MusicS m=new MusicS("enjoy","mednin");
        Instrument i1=new Piano("b1",true);
        Instrument i2=new Guitar("b3","pine","jumbo");
        Instrument i3=new Piano("b2",false);
        Instrument i4=new Guitar("b4","maple","parlor");
        m.add(i1);
        m.add(i2);
        m.add(i3);
        m.add(i4);
        m.print();
        System.out.println(m.nbpiano());
        m.delet(i4);
        m.print();
    }
}

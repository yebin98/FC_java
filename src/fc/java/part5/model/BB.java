package fc.java.part5.model;
//BB는 노출을 시키지 않는다.((BB.class : O), (BB.java : X))
public class BB implements CC{
    @Override
    public void x() {
        System.out.println("x동작 실행");
    }

    @Override
    public void y() {
        System.out.println("y동작 실행");
    }

    @Override
    public void z() {
        System.out.println("z동작 실행");
    }
}

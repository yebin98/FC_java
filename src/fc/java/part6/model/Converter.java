package fc.java.part6.model;

public interface Converter <F,T>{
    T convert(F from);
}

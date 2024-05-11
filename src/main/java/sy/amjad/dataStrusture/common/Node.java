package sy.amjad.dataStrusture.common;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Node<T> {

    @Getter @Setter
    private T value;
    @Getter @Setter
    private Node<T> next;

    @Override
    public String toString() {
        return this.value.toString();
    }
}

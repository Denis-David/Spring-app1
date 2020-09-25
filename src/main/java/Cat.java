import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
public class Cat {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

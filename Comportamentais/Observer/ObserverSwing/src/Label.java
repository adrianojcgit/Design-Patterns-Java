import javax.swing.*;
import java.awt.*;

public class Label  extends JLabel {
    private static final long serialVersionUID = -6974338600947333550L;

    private int count;
    private String text;

    public Label(String text) {
        super(text);
        this.count = 0;
        this.text = text;

        setFont(new Font(getFont().getName(), Font.BOLD, 30));
        increment();
    }

    public void increment() {
        setText(String.format("%s (%d)", text, count));
        count++;
    }
}

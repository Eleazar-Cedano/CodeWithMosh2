package UltimateJava2.TextBoxCode;

import UltimateJava2.UICode.UIControl;

public class TextBox extends UIControl {

    private String text= " "; // Field

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }
    @Override
    public String toString(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    } //setText ends here

    public void clear(){
        text = " ";
    } // clear() ends here.

} // TextBox class ends here.

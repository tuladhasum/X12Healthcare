package x12.segment;

/**
 * Created by xiaoerge on 5/23/16.
 */
public class INS extends Segment {
    public INS(String content) {
        super(content);
    }

    protected void setSize() {
        this.size = 0;
    }
    protected void setName() { this.name = "INS"; }
}

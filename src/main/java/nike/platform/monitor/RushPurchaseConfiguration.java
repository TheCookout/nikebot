package nike.platform.monitor;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/***
 * This class has no special meaning
* It is passed in as an object when adding a task on the monitoring page;
 */
public class RushPurchaseConfiguration {
    @Getter
    @Setter
    private String detailUrlId;
    @Getter @Setter
    private Integer monitorId;
    @Getter @Setter
    private List<String> chooseSize;

    @Override
    public String toString() {
        return "RushPurchaseConfiguration{" +
                "detailUrlId='" + detailUrlId + '\'' +
                ", monitorId=" + monitorId +
                ", chooseSize=" + chooseSize +
                '}';
    }
}

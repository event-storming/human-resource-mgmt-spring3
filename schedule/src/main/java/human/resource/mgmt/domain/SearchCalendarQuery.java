package human.resource.mgmt.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class SearchCalendarQuery {

    Date from;
    Date to;
    String userId;
}

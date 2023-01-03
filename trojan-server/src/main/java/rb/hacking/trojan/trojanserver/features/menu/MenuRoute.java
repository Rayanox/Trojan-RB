package rb.hacking.trojan.trojanserver.features.menu;

import lombok.Builder;
import lombok.NonNull;

import java.util.List;


@Builder
public class MenuRoute {

    @NonNull
    private String labelToDisplay;
    @NonNull
    private String commandExpected;
    @NonNull
    private List<MenuRoute> nextStep;

}

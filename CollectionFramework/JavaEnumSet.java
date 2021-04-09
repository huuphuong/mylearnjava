package CollectionFramework;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class JavaEnumSet {
    /**
     * Cài đặt chuyên biệt để làm việc với kiểu Enum
     * Kế thùa AbstractSet
     */

    public static void main(String[] args) {
        System.out.println("\t =========== PRINT 1  VÀI PHẦN TỬ CHỈ ĐỊNH =========== ");
        Set<days> set = EnumSet.of(days.MONDAY, days.TUESDAY, days.TUESDAY);
        Iterator<days> iter = set.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("\t =========== PRINT TOÀN BỘ PHẦN TỬ TRONG ENUM =========== ");
        Set<days> myDays = EnumSet.allOf(days.class); // .noneOf => Không lấy phần tử nào
        
        for (days myDay : myDays) {
            System.out.println(myDay);
        }
    }
}

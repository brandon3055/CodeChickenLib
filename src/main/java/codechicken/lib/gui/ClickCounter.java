//package codechicken.lib.gui;
//
//import com.google.common.base.Objects;
//
//import java.util.Map;
//import java.util.TreeMap;
//
//public class ClickCounter<T> {
//
//    public class ClickCount {
//
//        public T clicked;
//        public long time;
//        public int count;
//
//        public boolean update(T clicked) {
//            if (!Objects.equal(this.clicked, clicked)) {
//                this.clicked = clicked;
//                count = 0;
//                time = Long.MIN_VALUE;
//                return false;
//            }
//            return true;
//        }
//    }
//
//    public Map<Integer, ClickCount> buttons = new TreeMap<>();
//
//    public ClickCount getCount(int button) {
//        return buttons.computeIfAbsent(button, k -> new ClickCount());
//    }
//
//    public void mouseDown(T clicked, int button) {
//        ClickCount c = getCount(button);
//        c.update(clicked);
//    }
//
//    public int mouseUp(T clicked, int button) {
//        ClickCount c = getCount(button);
//        if (!c.update(clicked)) {
//            return 0;
//        }
//
//        long time = System.currentTimeMillis();
//        if (time - c.time < 500) {
//            c.count++;
//        } else {
//            c.count = 1;
//        }
//        c.time = time;
//        return c.count;
//    }
//}

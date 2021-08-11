package example.springframework.di.DependencyManager;

import java.util.ArrayList;
import java.util.List;

public class DependencyContextImpl implements DependencyContext{
    List<Object> objects=new ArrayList<>();

    @Override
    public Object getBean(String getClass) {
        Object result=null;
        for(Object o:objects){
            if(o.getClass().getSimpleName().equals(getClass)){
                result=o;
            }
        }
        return result;
    }

    @Override
    public void addBean(Object object) {
        objects.add(object);
    }
}

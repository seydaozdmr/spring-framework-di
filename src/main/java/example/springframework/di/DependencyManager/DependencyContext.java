package example.springframework.di.DependencyManager;

public interface DependencyContext {
    Object getBean(String getClass);
    void addBean(Object object);
}

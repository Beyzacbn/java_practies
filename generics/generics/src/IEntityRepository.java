public interface IEntityRepository <T implements IEntity> {
    void add(T entity);
    void delete(T entity);
    void update(T entity);

}

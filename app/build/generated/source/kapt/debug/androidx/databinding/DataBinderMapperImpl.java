package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.metinozcura.rickandmorty.DataBinderMapperImpl());
  }
}

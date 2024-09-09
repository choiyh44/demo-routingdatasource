# demo-routingdatasource
mybatis routing datasource demo

주용 설정 내용은 아래 두개 파일에 있습니다.
```angular2html
DataSourceconfig
RoutingDatasource
```

기본은 read write 데이터 소스를 사용하도록 설정되어 있습니다.
반대로 read only 데이터 소스를 사용하려면 서비스 클래스/메소드에 아래와 같이 readOnly transaction 어노테이션을 추가해야 합니다. 
```angular2html
@Transactional(readOnly = true)
```

실행 테스트는 RoDemoServiceTest 테스트클래스를 실행해보면 됩니다.

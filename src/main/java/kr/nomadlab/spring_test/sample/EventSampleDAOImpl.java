package kr.nomadlab.spring_test.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Qualifier("event")
@Primary
@Repository
public class EventSampleDAOImpl implements SampleDAO{

}


package space.androma.demo1.rest;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Expression;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.springframework.stereotype.Component;
import space.androma.demo1.entity.TestIn1;
import space.androma.demo1.entity.TestOut1;

@Slf4j
@Component
public class SberBioAuthentification extends RouteBuilder {
    /*
        private final Expression requestConverter;

        private final Expression responseConverter;

        private final Expression errorResponseConverter;


    @Autowired
    private ErrorConfiguration errorConfiguration;


        public SberBioAuthentification() {
            requestConverter = createRequestConverter();
            responseConverter = createResponseConverter();
            errorResponseConverter = createErrorResponseConverter();
        }
    */
    @Override
    public void configure() throws Exception {

        restConfiguration()
                .component("servlet");
        JacksonDataFormat requestInFormat = new JacksonDataFormat(TestIn1.class);
        requestInFormat.setUnmarshalType(TestOut1.class);
        requestInFormat.setAutoDiscoverObjectMapper(true);

        JacksonDataFormat requestOutFormat = new JacksonDataFormat(TestIn1.class);
        requestOutFormat.setUnmarshalType(TestOut1.class);
        requestOutFormat.setAutoDiscoverObjectMapper(true);

        JacksonDataFormat responseInFormat = new JacksonDataFormat(TestIn1.class);
        responseInFormat.setUnmarshalType(TestOut1.class);
        responseInFormat.setAutoDiscoverObjectMapper(true);
        JacksonDataFormat responseOutFormat = new JacksonDataFormat(TestIn1.class);
        responseOutFormat.setUnmarshalType(TestOut1.class);
        responseOutFormat.setAutoDiscoverObjectMapper(true);
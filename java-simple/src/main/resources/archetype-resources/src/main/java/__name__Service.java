package ${package};

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class ${name}Service extends Service<${name}Configuration> {

    public static void main(String[] args) throws Exception {
        new ${name}Service().run(args);
    }

	@Override
	public void initialize(Bootstrap<${name}Configuration> bootstrap) {
	    bootstrap.setName("${name}");
	}

    @Override
    public void run(${name}Configuration configuration, Environment environment) {
        // TODO: implement service, add resources, healthchecks etc...
    }

}

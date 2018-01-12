CUR_DIR=$(shell pwd)
LIB_DIR=$(CUR_DIR)/libs
SRC_DIR=$(CUR_DIR)/src
OUT_DIR=$(CUR_DIR)/classes

TEST ?= ExampleSpec

dep:
	@wget -N -P $(LIB_DIR) http://central.maven.org/maven2/junit/junit/4.12/junit-4.12.jar
	@wget -N -P $(LIB_DIR) http://central.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar
	@wget -N -P $(LIB_DIR) http://central.maven.org/maven2/org/spockframework/spock-core/1.1-groovy-2.4/spock-core-1.1-groovy-2.4.jar
	@wget -N -P $(LIB_DIR) http://central.maven.org/maven2/org/codehaus/groovy/groovy-all/2.4.13/groovy-all-2.4.13.jar

compile:
	@/bin/rm -rf $(OUT_DIR)
	@mkdir -p $(OUT_DIR)
	@groovyc -cp "$(LIB_DIR)/*" --sourcepath "$(SRC_DIR)" -d "$(OUT_DIR)" $(SRC_DIR)/*.groovy

test:
	@java -cp "$(LIB_DIR)/*:$(OUT_DIR)" org.junit.runner.JUnitCore $(TEST)

all:
	make dep && make compile && make test

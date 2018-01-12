CUR_DIR=$(shell pwd)
LIB_DIR=$(CUR_DIR)/libs
SRC_DIR=$(CUR_DIR)/src
OUT_DIR=$(CUR_DIR)/classes
TEST_OUTPUT_DIR=$(CUR_DIR)/test-output

TEST ?= TestExample

dep:
	@wget -N -P $(LIB_DIR) http://central.maven.org/maven2/org/testng/testng/6.13.1/testng-6.13.1.jar
	@wget -N -P $(LIB_DIR) http://central.maven.org/maven2/com/beust/jcommander/1.72/jcommander-1.72.jar

compile:
	@/bin/rm -rf $(OUT_DIR)
	@mkdir -p $(OUT_DIR)
	@javac -cp "$(LIB_DIR)/*" -s "$(SRC_DIR)" -d "$(OUT_DIR)" $(SRC_DIR)/*.java

test:
	@/bin/rm -rf $(TEST_OUTPUT_DIR)
	@java -cp "$(LIB_DIR)/*:$(OUT_DIR)" org.testng.TestNG -testclass $(TEST) testng.xml

all:
	make dep && make compile && make test

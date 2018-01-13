CUR_DIR=$(shell pwd)
LIB_DIR=$(CUR_DIR)/libs
SRC_DIR=$(CUR_DIR)/src
OUT_DIR=$(CUR_DIR)/classes
TEST_OUTPUT_DIR=$(CUR_DIR)/test-output
REPORT_DIR=$(CUR_DIR)/report

IMAGE_NAME=kodability/java

TEST ?= TestExample

dep:
	@wget -N -P $(LIB_DIR) http://central.maven.org/maven2/org/testng/testng/6.13.1/testng-6.13.1.jar
	@wget -N -P $(LIB_DIR) http://central.maven.org/maven2/com/beust/jcommander/1.72/jcommander-1.72.jar

image8:
	docker build -t $(IMAGE_NAME):8 -f Dockerfile-8 ./
image9:
	docker build -t $(IMAGE_NAME):9 -f Dockerfile-9 ./

sh8:
	docker run --rm -it -v $(CUR_DIR)/src:/test/src $(IMAGE_NAME):8 /bin/sh
sh9:
	docker run --rm -it -v $(CUR_DIR)/src:/test/src $(IMAGE_NAME):9 /bin/sh

run8:
	docker run --rm -v $(SRC_DIR):/test/src -v $(REPORT_DIR):/test/report $(IMAGE_NAME):8
run9:
	docker run --rm -v $(SRC_DIR):/test/src -v $(REPORT_DIR):/test/report $(IMAGE_NAME):9

compile:
	@/bin/rm -rf $(OUT_DIR)
	@mkdir -p $(OUT_DIR)
	@javac -cp "$(LIB_DIR)/*" -s "$(SRC_DIR)" -d "$(OUT_DIR)" $(SRC_DIR)/*.java

test:
	@/bin/rm -rf $(TEST_OUTPUT_DIR)
	@java -cp "$(LIB_DIR)/*:$(OUT_DIR)" org.testng.TestNG -testclass $(TEST) testng.xml

copyreport:
	@mkdir -p $(REPORT_DIR)
	@/bin/rm -f $(REPORT_DIR)/*
	@cp $(TEST_OUTPUT_DIR)/junitreports/*.xml $(REPORT_DIR)

all:
	make compile && make test && make copyreport

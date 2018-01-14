CUR_DIR=$(shell pwd)
LIB_DIR=$(CUR_DIR)/libs
SRC_DIR=$(CUR_DIR)/src
OUT_DIR=$(CUR_DIR)/classes
TEST_OUTPUT_DIR=$(CUR_DIR)/test-output
REPORT_DIR=$(CUR_DIR)/report

IMAGE_NAME=kodability/groovy

TEST ?= TestExample

image2:
	@docker build -t $(IMAGE_NAME):2 -f Dockerfile-2 ./
image3:
	@docker build -t $(IMAGE_NAME):3 -f Dockerfile-3 ./

sh2:
	docker run --rm -it -v $(CUR_DIR)/src:/test/src $(IMAGE_NAME):2 /bin/sh
sh3:
	docker run --rm -it -v $(CUR_DIR)/src:/test/src $(IMAGE_NAME):3 /bin/sh

run2:
	docker run --rm -v $(SRC_DIR):/test/src -v $(REPORT_DIR):/test/report $(IMAGE_NAME):2
run3:
	docker run --rm -v $(SRC_DIR):/test/src -v $(REPORT_DIR):/test/report $(IMAGE_NAME):3

compile:
	@/bin/rm -rf $(OUT_DIR)
	@mkdir -p $(OUT_DIR)
	@groovyc -cp "$(LIB_DIR)/*" --sourcepath "$(SRC_DIR)" -d "$(OUT_DIR)" $(SRC_DIR)/*

test:
	@/bin/rm -rf $(TEST_OUTPUT_DIR)
	@java -cp "$(GROOVY_HOME)/lib/*:$(OUT_DIR)" org.testng.TestNG -testclass $(TEST) testng.xml

copyreport:
	@mkdir -p $(REPORT_DIR)
	@/bin/rm -f $(REPORT_DIR)/*
	@cp $(TEST_OUTPUT_DIR)/junitreports/*.xml $(REPORT_DIR)

all:
	@make compile && make test && make copyreport

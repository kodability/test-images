CUR_DIR=$(shell pwd)
SRC_DIR=$(CUR_DIR)/src
TEST_DIR=$(CUR_DIR)/test
REPORT_DIR=$(CUR_DIR)/report

IMAGE_NAME=kodability/javascript

TEST ?= TestExample

image9:
	@docker build -t $(IMAGE_NAME):9 -f Dockerfile-9 ./

sh9:
	docker run --rm -it -v $(SRC_DIR):/test/src -v $(TEST_DIR):/test/test $(IMAGE_NAME):9 /bin/sh

run9:
	docker run --rm -v $(SRC_DIR):/test/src -v $(TEST_DIR):/test/test -v $(REPORT_DIR):/test/report $(IMAGE_NAME):9

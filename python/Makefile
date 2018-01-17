CUR_DIR=$(shell pwd)
SRC_DIR=$(CUR_DIR)/src
REPORT_DIR=$(CUR_DIR)/report

IMAGE_NAME=kodability/python

TEST ?= example_test

image2:
	docker build -t $(IMAGE_NAME):2 -f Dockerfile-2 ./
image3:
	docker build -t $(IMAGE_NAME):3 -f Dockerfile-3 ./

sh2:
	docker run --rm -it -v $(CUR_DIR)/src:/test/src $(IMAGE_NAME):2 /bin/sh
sh3:
	docker run --rm -it -v $(CUR_DIR)/src:/test/src $(IMAGE_NAME):3 /bin/sh

run2:
	docker run --rm -v $(SRC_DIR):/test/src -v $(REPORT_DIR):/test/report $(IMAGE_NAME):2
run3:
	docker run --rm -v $(SRC_DIR):/test/src -v $(REPORT_DIR):/test/report $(IMAGE_NAME):3

test:
	@/bin/rm -rf $(REPORT_DIR)/*
	@python -B $(SRC_DIR)/$(TEST).py

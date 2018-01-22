BASE_DIR=$(dir $(realpath $(firstword $(MAKEFILE_LIST))))
EXT_DIR=$(BASE_DIR)/ext
PKG_DIR=$(EXT_DIR)/pkg
BIN_DIR=$(EXT_DIR)/bin
SRC_DIR=$(BASE_DIR)/src
REPORT_DIR=$(BASE_DIR)/report

IMAGE_NAME=kodability/go

image1:
	@docker build -t $(IMAGE_NAME):1.9 -f Dockerfile-109 ./

sh1:
	docker run --rm -it -v $(BASE_DIR)/src:/test/src $(IMAGE_NAME):1.9 /bin/sh

run1:
	docker run --rm -v $(SRC_DIR):/test/src -v $(REPORT_DIR):/test/report $(IMAGE_NAME):1.9

dep:
	@GOPATH=$(EXT_DIR) go get -u github.com/jstemmer/go-junit-report

test:
	@mkdir -p $(REPORT_DIR)
	@GOPATH=$(EXT_DIR):$(BASE_DIR) go test -v $(SRC_DIR)/*.go 2>&1 | $(BIN_DIR)/go-junit-report > $(REPORT_DIR)/report.xml

clean:
	@rm -rf $(EXT_DIR) $(REPORT_DIR)

all:
	@make clean && make dep && make test

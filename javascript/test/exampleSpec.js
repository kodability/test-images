const assert = require('assert');
const example = require('../src/example');
const sum = example.sum;

describe('', function() {
    it('test1', function() {
        assert.equal(sum(1,10), 55);
    });
    it('test2', function() {
        assert.equal(sum(1,1), 1);
    });
});

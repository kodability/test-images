const assert = require('assert');
const example = require('../src/example');
const sum = example.sum;

describe('', function() {
    it('test', function() {
        assert.equal(sum(1,10), 55);
    });
});

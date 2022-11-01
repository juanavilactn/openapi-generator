# coding: utf-8

"""
    openapi 3.0.3 sample spec

    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501

    The version of the OpenAPI document: 0.0.1
    Generated by: https://openapi-generator.tech
"""

import unittest

import unit_test_api
from unit_test_api.model.allof_with_two_empty_schemas import AllofWithTwoEmptySchemas
from unit_test_api import configuration


class TestAllofWithTwoEmptySchemas(unittest.TestCase):
    """AllofWithTwoEmptySchemas unit test stubs"""
    _configuration = configuration.Configuration()

    def test_any_data_is_valid_passes(self):
        # any data is valid
        AllofWithTwoEmptySchemas.from_openapi_data_oapg(
            1,
            _configuration=self._configuration
        )


if __name__ == '__main__':
    unittest.main()
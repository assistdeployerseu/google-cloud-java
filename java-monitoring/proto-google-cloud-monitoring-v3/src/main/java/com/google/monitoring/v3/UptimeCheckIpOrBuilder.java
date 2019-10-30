/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/uptime.proto

package com.google.monitoring.v3;

public interface UptimeCheckIpOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.UptimeCheckIp)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A broad region category in which the IP address is located.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckRegion region = 1;</code>
   */
  int getRegionValue();
  /**
   *
   *
   * <pre>
   * A broad region category in which the IP address is located.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckRegion region = 1;</code>
   */
  com.google.monitoring.v3.UptimeCheckRegion getRegion();

  /**
   *
   *
   * <pre>
   * A more specific location within the region that typically encodes
   * a particular city/town/metro (and its containing state/province or country)
   * within the broader umbrella region category.
   * </pre>
   *
   * <code>string location = 2;</code>
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * A more specific location within the region that typically encodes
   * a particular city/town/metro (and its containing state/province or country)
   * within the broader umbrella region category.
   * </pre>
   *
   * <code>string location = 2;</code>
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * The IP address from which the Uptime check originates. This is a fully
   * specified IP address (not an IP address range). Most IP addresses, as of
   * this publication, are in IPv4 format; however, one should not rely on the
   * IP addresses being in IPv4 format indefinitely, and should support
   * interpreting this field in either IPv4 or IPv6 format.
   * </pre>
   *
   * <code>string ip_address = 3;</code>
   */
  java.lang.String getIpAddress();
  /**
   *
   *
   * <pre>
   * The IP address from which the Uptime check originates. This is a fully
   * specified IP address (not an IP address range). Most IP addresses, as of
   * this publication, are in IPv4 format; however, one should not rely on the
   * IP addresses being in IPv4 format indefinitely, and should support
   * interpreting this field in either IPv4 or IPv6 format.
   * </pre>
   *
   * <code>string ip_address = 3;</code>
   */
  com.google.protobuf.ByteString getIpAddressBytes();
}

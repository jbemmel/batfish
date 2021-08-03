package org.batfish.representation.cisco_xr;

import org.batfish.vendor.StructureUsage;

public enum CiscoXrStructureUsage implements StructureUsage {
  BGP_ADDITIONAL_PATHS_SELECTION_ROUTE_POLICY("bgp additional-paths selection route-policy"),
  BGP_AGGREGATE_ROUTE_POLICY("aggregate-address route-policy"),
  BGP_DEFAULT_ORIGINATE_ROUTE_POLICY("bgp default-originate route-policy"),
  BGP_INHERITED_PEER_POLICY("inherited BGP peer-policy"),
  BGP_INHERITED_SESSION("inherited BGP peer-session"),
  BGP_LISTEN_RANGE_PEER_GROUP("bgp listen range peer-group"),
  BGP_NEIGHBOR_PEER_GROUP("bgp neighbor peer-group"),
  BGP_NEIGHBOR_ROUTE_POLICY_IN("bgp neighbor route-policy in"),
  BGP_NEIGHBOR_ROUTE_POLICY_OUT("bgp neighbor route-policy out"),
  BGP_NETWORK_ROUTE_POLICY("bgp network route-policy"),
  BGP_REDISTRIBUTE_CONNECTED_ROUTE_POLICY("bgp redistribute connected route-policy"),
  BGP_REDISTRIBUTE_STATIC_ROUTE_POLICY("bgp redistribute static route-policy"),
  BGP_UPDATE_SOURCE_INTERFACE("update-source interface"),
  BGP_USE_AF_GROUP("bgp use af-group"),
  BGP_USE_NEIGHBOR_GROUP("bgp use neighbor-group"),
  BGP_USE_SESSION_GROUP("bgp use session-group"),
  BRIDGE_DOMAIN_INTERFACE("bridge-domain interface"),
  BRIDGE_DOMAIN_ROUTED_INTERFACE("bridge-domain routed interface"),
  CLASS_MAP_ACCESS_GROUP("class-map access-group"),
  CLASS_MAP_ACCESS_LIST("class-map access-list"),
  CLASS_MAP_ACTIVATED_SERVICE_TEMPLATE("class-map activate-service-template"),
  CLASS_MAP_SERVICE_TEMPLATE("class-map service-template"),
  CONTROL_PLANE_ACCESS_GROUP("control-plane ip access-group"),
  CONTROL_PLANE_SERVICE_POLICY_INPUT("control-plane service-policy input"),
  CONTROL_PLANE_SERVICE_POLICY_OUTPUT("control-plane service-policy output"),
  CRYPTO_DYNAMIC_MAP_ACL("crypto dynamic-map acl"),
  CRYPTO_DYNAMIC_MAP_ISAKMP_PROFILE("crypto dynamic-map isakmp-profile"),
  CRYPTO_DYNAMIC_MAP_TRANSFORM_SET("crypto dynamic-map transform-set"),
  CRYPTO_MAP_IPSEC_ISAKMP_ACL("crypto map ipsec-isakmp acl"),
  CRYPTO_MAP_IPSEC_ISAKMP_CRYPTO_DYNAMIC_MAP_SET("crypto map ipsec-isakmp crypto-dynamic-map-set"),
  CRYPTO_MAP_IPSEC_ISAKMP_ISAKMP_PROFILE("crypto map ipsec-isakmp isakmp-profile"),
  CRYPTO_MAP_IPSEC_ISAKMP_TRANSFORM_SET("crypto map ipsec-isakmp transform-set"),
  DOMAIN_LOOKUP_SOURCE_INTERFACE("domain lookup source-interface"),
  EIGRP_AF_INTERFACE("eigrp address-family af-interface"),
  EIGRP_PASSIVE_INTERFACE("eigrp passive-interface"),
  FAILOVER_LAN_INTERFACE("failover lan interface"),
  FAILOVER_LINK_INTERFACE("failover link interface"),
  FLOW_MONITOR_MAP_EXPORTER("flow monitor-map exporter"),
  INTERFACE_BFD_TEMPLATE("interface bfd template"),
  INTERFACE_FLOW_IPV4_MONITOR_EGRESS("interface flow ipv4 monitor egress"),
  INTERFACE_FLOW_IPV4_MONITOR_INGRESS("interface flow ipv4 monitor ingress"),
  INTERFACE_FLOW_IPV4_SAMPLER_EGRESS("interface flow ipv4 sampler egress"),
  INTERFACE_FLOW_IPV4_SAMPLER_INGRESS("interface flow ipv4 sampler ingress"),
  INTERFACE_FLOW_IPV6_MONITOR_EGRESS("interface flow ipv6 monitor egress"),
  INTERFACE_FLOW_IPV6_MONITOR_INGRESS("interface flow ipv6 monitor ingress"),
  INTERFACE_FLOW_IPV6_SAMPLER_EGRESS("interface flow ipv6 sampler egress"),
  INTERFACE_FLOW_IPV6_SAMPLER_INGRESS("interface flow ipv6 sampler ingress"),
  INTERFACE_IGMP_ACCESS_GROUP_ACL("interface igmp access-group acl"),
  INTERFACE_IGMP_HOST_PROXY_ACCESS_LIST("interface igmp host-proxy access-list"),
  INTERFACE_IGMP_STATIC_GROUP_ACL("interface igmp static-group acl"),
  INTERFACE_IP_VERIFY_ACCESS_LIST("interface ip verify access-list"),
  INTERFACE_IPV4_ACCESS_GROUP_COMMON("interface ipv4 access-group common"),
  INTERFACE_IPV4_ACCESS_GROUP_EGRESS("interface ipv4 access-group egress"),
  INTERFACE_IPV4_ACCESS_GROUP_INGRESS("interface ipv4 access-group ingress"),
  INTERFACE_IPV6_ACCESS_GROUP_COMMON("interface ipv6 access-group common"),
  INTERFACE_IPV6_ACCESS_GROUP_EGRESS("interface ipv6 access-group egress"),
  INTERFACE_IPV6_ACCESS_GROUP_INGRESS("interface ipv6 access-group ingress"),
  INTERFACE_IPV6_TRAFFIC_FILTER_IN("interface ipv6 traffic-filter in"),
  INTERFACE_IPV6_TRAFFIC_FILTER_OUT("interface ipv6 traffic-filter out"),
  INTERFACE_PIM_NEIGHBOR_FILTER("interface ip pim neighbor-filter"),
  INTERFACE_SELF_REF("interface"),
  INTERFACE_SERVICE_POLICY("interface service-policy"),
  INTERFACE_STANDBY_TRACK("interface standby track"),
  IP_DOMAIN_LOOKUP_INTERFACE("ip domain lookup interface"),
  IP_ROUTE_NHINT("ip route next-hop interface"),
  IP_TACACS_SOURCE_INTERFACE("ip tacacs source-interface"),
  IPSEC_PROFILE_ISAKMP_PROFILE("ipsec profile set isakmp-profile"),
  IPSEC_PROFILE_TRANSFORM_SET("ipsec profile set transform-set"),
  IPV4_ACCESS_LIST_LINE_SELF_REF("ipv4 access-list line"),
  ISAKMP_POLICY_SELF_REF("isakmp policy"),
  ISAKMP_PROFILE_KEYRING("isakmp profile keyring"),
  ISAKMP_PROFILE_SELF_REF("isakmp profile"),
  LINE_ACCESS_CLASS_LIST("line access-class list"),
  LINE_ACCESS_CLASS_LIST6("line access-class ipv6 list"),
  MANAGEMENT_SSH_ACCESS_GROUP("management ssh ip access-group"),
  MANAGEMENT_TELNET_ACCESS_GROUP("management telnet ip access-group"),
  MPLS_LDP_AF_IPV4_DISCOVERY_TARGETED_HELLO_ACCEPT_FROM(
      "mpls ldp address-family ipv4 discovery targeted-hello accept from"),
  MPLS_LDP_AF_IPV4_REDISTRIBUTE_BGP_ADVERTISE_TO(
      "mpls ldp address-family ipv4 redistribute bgp advertise-to"),
  MPLS_LDP_AF_IPV6_DISCOVERY_TARGETED_HELLO_ACCEPT_FROM(
      "mpls ldp address-family ipv6 discovery targeted-hello accept from"),
  MPLS_LDP_AF_IPV6_REDISTRIBUTE_BGP_ADVERTISE_TO(
      "mpls ldp address-family ipv6 redistribute bgp advertise-to"),
  ROUTER_MSDP_CACHE_SA_STATE_LIST("router msdp cache-sa-state list"),
  ROUTER_MSDP_CACHE_SA_STATE_RP_LIST("router msdp cache-sa-state list"),
  ROUTER_MSDP_SA_FILTER_IN_LIST("router msdp sa-filter in list"),
  ROUTER_MSDP_SA_FILTER_IN_RP_LIST("router msdp sa-filter in rp-list"),
  ROUTER_MSDP_SA_FILTER_OUT_LIST("router msdp sa-filter out list"),
  ROUTER_MSDP_SA_FILTER_OUT_RP_LIST("router msdp sa-filter out rp-list"),
  MULTICAST_ROUTING_CORE_TREE_PROTOCOL_RSVP_TE_GROUP_LIST(
      "multicast-routing core-tree-protocol rsvp-te group-list"),
  NAMED_RSA_PUB_KEY_SELF_REF("named rsa pubkey"),
  NETWORK_OBJECT_GROUP_GROUP_OBJECT("object-group network group-object"),
  NETWORK_OBJECT_GROUP_NETWORK_OBJECT("object-group network network-object object"),
  NTP_ACCESS_GROUP_PEER("ntp access-group peer"),
  NTP_ACCESS_GROUP_QUERY_ONLY("ntp access-group query-only"),
  NTP_ACCESS_GROUP_SERVE("ntp access-group serve"),
  NTP_ACCESS_GROUP_SERVE_ONLY("ntp access-group serve-only"),
  NTP_SOURCE_INTERFACE("ntp source-interface"),
  OSPF_AREA_FILTER_LIST("ospf area filter-list"),
  OSPF_AREA_INTERFACE("router ospf area interface"),
  OSPF_DEFAULT_INFORMATION_ROUTE_POLICY("router ospf default-information route-policy"),
  OSPF_DISTRIBUTE_LIST_ACCESS_LIST_IN("router ospf distribute-list in"),
  OSPF_DISTRIBUTE_LIST_ACCESS_LIST_OUT("router ospf distribute-list out"),
  OSPF_DISTRIBUTE_LIST_PREFIX_LIST_IN("router ospf distribute-list prefix-list in"),
  OSPF_DISTRIBUTE_LIST_PREFIX_LIST_OUT("router ospf distribute-list prefix-list out"),
  OSPF_DISTRIBUTE_LIST_ROUTE_POLICY_IN("router ospf distribute-list route-policy in"),
  OSPF_REDISTRIBUTE_ROUTE_POLICY("router ospf redistribute route-policy"),
  ROUTER_PIM_ACCEPT_REGISTER("router pim accept-register"),
  ROUTER_PIM_ALLOW_RP_GROUP_LIST("router pim allow-rp group-list"),
  ROUTER_PIM_ALLOW_RP_RP_LIST("router pim allow-rp rp-list"),
  ROUTER_PIM_SSM_THRESHOLD_RANGE("router pim ssm threshold range"),
  ROUTER_PIM_MDT_NEIGHBOR_FILTER("router pim mdt neighbor-filter"),
  ROUTER_PIM_NEIGHBOR_FILTER("router pim neighbor-filter"),
  ROUTER_PIM_INTERFACE_NEIGHBOR_FILTER("router pim interface neighbor-filter"),
  ROUTER_PIM_RP_STATIC_DENY("router pim rp-static-deny"),
  ROUTER_PIM_RPF_TOPOLOGY("router pim rpf topology"),
  ROUTER_PIM_SG_EXPIRY_TIMER("router pim sg-expiry-timer"),
  ROUTER_PIM_AUTO_RP_CANDIDATE_RP_GROUP_LIST("router pim auto-rp candidate-rp group-list"),
  ROUTER_PIM_RPF_REDIRECT_ROUTE_POLICY("router pim rpf-redirect route-policy"),
  ROUTER_PIM_EMBEDDED_RP_RENDEZVOUS_POINT("router pim embedded-rp rendezvous point"),
  ROUTER_PIM_RPF("router pim rpf"),
  ROUTER_PIM_MOFRR_FLOW("router pim mofrr flow"),
  ROUTER_PIM_MOFRR_RIB("router pim mofrr rib"),
  ROUTER_PIM_RP_ADDRESS("router pim rp-address"),
  PIM_RP_ANNOUNCE_FILTER("pim rp announce filter"),
  ROUTER_PIM_BSR_CANDIDATE_RP("router pim bsr candidate-rp"),
  PIM_SEND_RP_ANNOUNCE_ACL("pim send rp announce acl"),
  ROUTER_PIM_SPT_THRESHOLD("router pim spt-threshold"),
  POLICY_MAP_CLASS("policy-map class"),
  POLICY_MAP_CLASS_SERVICE_POLICY("policy-map class service-policy"),
  POLICY_MAP_EVENT_CLASS("policy-map event class"),
  POLICY_MAP_EVENT_CLASS_ACTIVATE("policy-map event class activate"),
  ROUTE_POLICY_APPLY_EXPR("route-policy apply (boolean expression)"),
  ROUTE_POLICY_APPLY_STATEMENT("route-policy apply (statement)"),
  ROUTE_POLICY_AS_PATH_IN("route-policy as-path in"),
  ROUTE_POLICY_COMMUNITY_MATCHES_ANY("route-policy community matches-any"),
  ROUTE_POLICY_COMMUNITY_MATCHES_EVERY("route-policy community matches-every"),
  ROUTE_POLICY_DELETE_COMMUNITY_IN("route-policy delete community [not] in"),
  ROUTE_POLICY_EXTCOMMUNITY_RT_MATCHES_ANY("route-policy extcommunity rt matches-any"),
  ROUTE_POLICY_EXTCOMMUNITY_RT_MATCHES_EVERY("route-policy extcommunity rt matches-every"),
  ROUTE_POLICY_PREFIX_SET("route-policy prefix-set"),
  ROUTE_POLICY_RD_IN("route-policy rd in"),
  ROUTE_POLICY_SET_COMMUNITY("route-policy set community"),
  ROUTE_POLICY_SET_EXTCOMMUNITY_RT("route-policy set extcommunity rt"),
  ROUTER_IGMP_ACCESS_GROUP("router igmp access-group"),
  ROUTER_IGMP_EXPLICIT_TRACKING("router igmp explicit-tracking"),
  ROUTER_IGMP_MAXIMUM_GROUPS_PER_INTERFACE("router igmp maximum groups-per-interface"),
  ROUTER_IGMP_SSM_MAP_STATIC("router igmp ssm map static"),
  ROUTER_MLD_ACCESS_GROUP("router mld access-group"),
  ROUTER_MLD_EXPLICIT_TRACKING("router mld explicit-tracking"),
  ROUTER_MLD_MAXIMUM_GROUPS_PER_INTERFACE("router mld maximum groups-per-interface"),
  ROUTER_MLD_SSM_MAP_STATIC("router mld ssm map static"),
  ROUTER_ISIS_REDISTRIBUTE_CONNECTED_ROUTE_POLICY(
      "router isis redistribute connected route-policy"),
  ROUTER_ISIS_REDISTRIBUTE_STATIC_ROUTE_POLICY("router isis redistribute static route-policy"),
  ROUTER_STATIC_ROUTE("router static route"),
  ROUTER_VRRP_INTERFACE("router vrrp interface"),
  SERVICE_OBJECT_GROUP_SERVICE_OBJECT("object-group service service-object object"),
  SERVICE_POLICY_GLOBAL("service-policy global"),
  SNMP_SERVER_COMMUNITY_ACL4("snmp server community ipv4 acl"),
  SNMP_SERVER_COMMUNITY_ACL6("snmp server community ipv6 acl"),
  SNMP_SERVER_SOURCE_INTERFACE("snmp-server source-interface"),
  SNMP_SERVER_TRAP_SOURCE("snmp-server trap-source"),
  SYSTEM_SERVICE_POLICY("system service-policy"),
  SSH_IPV4_ACL("ssh ipv4 access-list"),
  SSH_IPV6_ACL("ssh ipv6 access-list"),
  TACACS_SOURCE_INTERFACE("tacacs source-interface"),
  TRACK_INTERFACE("track interface"),
  TUNNEL_PROTECTION_IPSEC_PROFILE("interface TunnelX tunnel protection ipsec profile"),
  TUNNEL_SOURCE("tunnel source"),
  VRF_EXPORT_ROUTE_POLICY("vrf export route-policy"),
  VRF_EXPORT_TO_DEFAULT_VRF_ROUTE_POLICY("vrf export to default-vrf route-policy"),
  VRF_IMPORT_ROUTE_POLICY("vrf import route-policy"),
  VRF_IMPORT_FROM_DEFAULT_VRF_ROUTE_POLICY("vrf import from default-vrf route-policy");

  private final String _description;

  CiscoXrStructureUsage(String description) {
    _description = description;
  }

  @Override
  public String getDescription() {
    return _description;
  }
}

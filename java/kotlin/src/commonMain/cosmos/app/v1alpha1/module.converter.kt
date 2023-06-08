// Transform from cosmos/app/v1alpha1/module.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.app.v1alpha1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object ModuleDescriptorConverter : ProtobufConverter<ModuleDescriptor>

public expect object PackageReferenceConverter : ProtobufConverter<PackageReference>

public expect object MigrateFromInfoConverter : ProtobufConverter<MigrateFromInfo>

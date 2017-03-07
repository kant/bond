
//------------------------------------------------------------------------------
// This code was generated by a tool.
//
//   Tool : Bond Compiler 0.8.0.0
//   Input filename:  ../idl/bond/core/bond.bond
//   Output filename: StructDef.java
//
// Changes to this file may cause incorrect behavior and will be lost when
// the code is regenerated.
// <auto-generated />
//------------------------------------------------------------------------------

package com.microsoft.bond;


@javax.annotation.Generated("gbc")
public class StructDef implements com.microsoft.bond.BondSerializable {

    public static final com.microsoft.bond.SchemaDef SCHEMA = new com.microsoft.bond.SchemaDef();
    public static final com.microsoft.bond.StructDef STRUCT_DEF = new com.microsoft.bond.StructDef();
    private static final com.microsoft.bond.FieldDef metadata_FIELD_DEF = new com.microsoft.bond.FieldDef();
    private static final com.microsoft.bond.FieldDef base_def_FIELD_DEF = new com.microsoft.bond.FieldDef();
    private static final com.microsoft.bond.FieldDef fields_FIELD_DEF = new com.microsoft.bond.FieldDef();
    private static boolean schemaInitialized = false;

    public static synchronized void initSchema() {
        if (schemaInitialized) { return; }

        SCHEMA.root.id = com.microsoft.bond.BondDataType.BT_STRUCT;
        SCHEMA.root.struct_def = 0;
        SCHEMA.root.element = null;
        SCHEMA.root.key = null;
        SCHEMA.root.bonded_type = false;

        STRUCT_DEF.metadata.name = "StructDef";
        STRUCT_DEF.metadata.qualified_name = "com.microsoft.bond.StructDef";
        STRUCT_DEF.metadata.modifier = com.microsoft.bond.Modifier.Optional;
        
        // TODO: .base_def
        SCHEMA.structs.add(0, STRUCT_DEF);

        metadata_FIELD_DEF.metadata.name = "metadata";
        metadata_FIELD_DEF.metadata.qualified_name = "";
        // TODO: .metadata.qualifier
        
        metadata_FIELD_DEF.id = 0;
        metadata_FIELD_DEF.type.id = com.microsoft.bond.BondDataType.BT_STRUCT;
        try {
            Class<com.microsoft.bond.Metadata> MetadataStructClass = com.microsoft.bond.Metadata.class;
            com.microsoft.bond.StructDef MetadataStructDef = (com.microsoft.bond.StructDef) (MetadataStructClass.getDeclaredField("STRUCT_DEF").get(null));
            metadata_FIELD_DEF.type.struct_def = com.microsoft.bond.schema.SchemaUtils.add(SCHEMA, MetadataStructDef, MetadataStructClass);
        } catch (NoSuchFieldException nsfe) {
            throw new RuntimeException(nsfe);
        } catch (IllegalAccessException iae) {
            throw new RuntimeException(iae);
        }
        // TODO: .type.element
        // TODO: .type.key
        metadata_FIELD_DEF.type.bonded_type = false;
        STRUCT_DEF.fields.add(metadata_FIELD_DEF);

        base_def_FIELD_DEF.metadata.name = "base_def";
        base_def_FIELD_DEF.metadata.qualified_name = "";
        // TODO: .metadata.qualifier
        
        base_def_FIELD_DEF.id = 1;
        base_def_FIELD_DEF.type.id = com.microsoft.bond.BondDataType.BT_LIST;
        base_def_FIELD_DEF.type.struct_def = 0;
        base_def_FIELD_DEF.type.element = new com.microsoft.bond.TypeDef();
        base_def_FIELD_DEF.type.element.id = com.microsoft.bond.BondDataType.BT_STRUCT;
        try {
            Class<com.microsoft.bond.TypeDef> TypeDefStructClass = com.microsoft.bond.TypeDef.class;
            com.microsoft.bond.StructDef TypeDefStructDef = (com.microsoft.bond.StructDef) (TypeDefStructClass.getDeclaredField("STRUCT_DEF").get(null));
            base_def_FIELD_DEF.type.element.struct_def = com.microsoft.bond.schema.SchemaUtils.add(SCHEMA, TypeDefStructDef, TypeDefStructClass);
        } catch (NoSuchFieldException nsfe) {
            throw new RuntimeException(nsfe);
        } catch (IllegalAccessException iae) {
            throw new RuntimeException(iae);
        }
        // TODO: .type.element
        // TODO: .type.key
        base_def_FIELD_DEF.type.element.bonded_type = false;
        base_def_FIELD_DEF.type.key = null;
        base_def_FIELD_DEF.type.bonded_type = false;
        STRUCT_DEF.fields.add(base_def_FIELD_DEF);

        fields_FIELD_DEF.metadata.name = "fields";
        fields_FIELD_DEF.metadata.qualified_name = "";
        // TODO: .metadata.qualifier
        
        fields_FIELD_DEF.id = 2;
        fields_FIELD_DEF.type.id = com.microsoft.bond.BondDataType.BT_LIST;
        fields_FIELD_DEF.type.struct_def = 0;
        fields_FIELD_DEF.type.element = new com.microsoft.bond.TypeDef();
        fields_FIELD_DEF.type.element.id = com.microsoft.bond.BondDataType.BT_STRUCT;
        try {
            Class<com.microsoft.bond.FieldDef> FieldDefStructClass = com.microsoft.bond.FieldDef.class;
            com.microsoft.bond.StructDef FieldDefStructDef = (com.microsoft.bond.StructDef) (FieldDefStructClass.getDeclaredField("STRUCT_DEF").get(null));
            fields_FIELD_DEF.type.element.struct_def = com.microsoft.bond.schema.SchemaUtils.add(SCHEMA, FieldDefStructDef, FieldDefStructClass);
        } catch (NoSuchFieldException nsfe) {
            throw new RuntimeException(nsfe);
        } catch (IllegalAccessException iae) {
            throw new RuntimeException(iae);
        }
        // TODO: .type.element
        // TODO: .type.key
        fields_FIELD_DEF.type.element.bonded_type = false;
        fields_FIELD_DEF.type.key = null;
        fields_FIELD_DEF.type.bonded_type = false;
        STRUCT_DEF.fields.add(fields_FIELD_DEF);

        schemaInitialized = true;
    }

    public static com.microsoft.bond.SchemaDef getSchema() {
        initSchema();
        return SCHEMA;
    }

    public static com.microsoft.bond.StructDef getStructDef() {
        initSchema();
        return STRUCT_DEF;
    }
    

    private final com.microsoft.bond.protocol.TaggedProtocolReader.ReadFieldResult __readFieldResult = new com.microsoft.bond.protocol.TaggedProtocolReader.ReadFieldResult();
    private final com.microsoft.bond.protocol.TaggedProtocolReader.ReadContainerResult __readContainerResult = new com.microsoft.bond.protocol.TaggedProtocolReader.ReadContainerResult();

    public Metadata metadata = new Metadata();

    public TypeDef base_def = null;

    public java.util.List<FieldDef> fields = new java.util.ArrayList();

    @Override
    public void serialize(com.microsoft.bond.protocol.ProtocolWriter writer) throws java.io.IOException {
        initSchema();

        writer.writeStructBegin(SCHEMA.structs.get(0).metadata);
        
        writer.writeFieldBegin(com.microsoft.bond.BondDataType.BT_STRUCT, 0, metadata_FIELD_DEF.metadata);
        this.metadata.serialize(writer);
        writer.writeFieldEnd();
        
        writer.writeFieldBegin(com.microsoft.bond.BondDataType.BT_LIST, 1, base_def_FIELD_DEF.metadata);
        if (this.base_def == null) {
            writer.writeContainerBegin(0, com.microsoft.bond.BondDataType.BT_STRUCT);
        } else {
            writer.writeContainerBegin(1, com.microsoft.bond.BondDataType.BT_STRUCT);
            this.base_def.serialize(writer);
        }
        writer.writeContainerEnd();
        writer.writeFieldEnd();
        
        writer.writeFieldBegin(com.microsoft.bond.BondDataType.BT_LIST, 2, fields_FIELD_DEF.metadata);
        writer.writeContainerBegin(this.fields.size(), com.microsoft.bond.BondDataType.BT_STRUCT);
        for (FieldDef e0 : this.fields) {
            e0.serialize(writer);
        }
        writer.writeContainerEnd();
        writer.writeFieldEnd();
        
        writer.writeStructEnd();
    }

    @Override
    public void deserialize(com.microsoft.bond.protocol.TaggedProtocolReader reader) throws java.io.IOException {
        initSchema();

        reader.readStructBegin();
        
        reader.readFieldBegin(this.__readFieldResult);
        this.metadata = new Metadata(); this.metadata.deserialize(reader);
        reader.readFieldEnd();
        
        reader.readFieldBegin(this.__readFieldResult);
        reader.readListBegin(this.__readContainerResult);
        if (this.__readContainerResult.count == 0) {
            this.base_def = null;
        } else {
            this.base_def = new TypeDef(); this.base_def.deserialize(reader);
        }
        reader.readContainerEnd();
        reader.readFieldEnd();
        
        reader.readFieldBegin(this.__readFieldResult);
        reader.readListBegin(this.__readContainerResult);
        {
            long count0 = this.__readContainerResult.count;
            for (long i0 = 0; i0 < count0; i0++) {
                FieldDef e0;
                e0 = new FieldDef(); e0.deserialize(reader);
                this.fields.add(e0);
            }
        }
        reader.readContainerEnd();
        reader.readFieldEnd();
        
        reader.readStructEnd();
    }

    @Override
    public void marshal(com.microsoft.bond.protocol.ProtocolWriter writer) throws java.io.IOException {
        writer.writeVersion();
        serialize(writer);
    }
}
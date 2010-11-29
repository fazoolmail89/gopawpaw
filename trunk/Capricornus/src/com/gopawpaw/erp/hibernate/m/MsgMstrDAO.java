package com.gopawpaw.erp.hibernate.m;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * MsgMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.m.MsgMstr
 * @author MyEclipse Persistence Tools
 */

public class MsgMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(MsgMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(MsgMstr transientInstance) {
		log.debug("saving MsgMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MsgMstr persistentInstance) {
		log.debug("deleting MsgMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MsgMstr findById(com.gopawpaw.erp.hibernate.m.MsgMstrId id) {
		log.debug("getting MsgMstr instance with id: " + id);
		try {
			MsgMstr instance = (MsgMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.m.MsgMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MsgMstr instance) {
		log.debug("finding MsgMstr instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding MsgMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MsgMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all MsgMstr instances");
		try {
			String queryString = "from MsgMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MsgMstr merge(MsgMstr detachedInstance) {
		log.debug("merging MsgMstr instance");
		try {
			MsgMstr result = (MsgMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MsgMstr instance) {
		log.debug("attaching dirty MsgMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MsgMstr instance) {
		log.debug("attaching clean MsgMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MsgMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MsgMstrDAO) ctx.getBean("MsgMstrDAO");
	}
}
package com.gopawpaw.erp.hibernate.v;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * VdMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.v.VdMstr
 * @author MyEclipse Persistence Tools
 */

public class VdMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(VdMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(VdMstr transientInstance) {
		log.debug("saving VdMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(VdMstr persistentInstance) {
		log.debug("deleting VdMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public VdMstr findById(com.gopawpaw.erp.hibernate.v.VdMstrId id) {
		log.debug("getting VdMstr instance with id: " + id);
		try {
			VdMstr instance = (VdMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.v.VdMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(VdMstr instance) {
		log.debug("finding VdMstr instance by example");
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
		log.debug("finding VdMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from VdMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all VdMstr instances");
		try {
			String queryString = "from VdMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public VdMstr merge(VdMstr detachedInstance) {
		log.debug("merging VdMstr instance");
		try {
			VdMstr result = (VdMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(VdMstr instance) {
		log.debug("attaching dirty VdMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(VdMstr instance) {
		log.debug("attaching clean VdMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static VdMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (VdMstrDAO) ctx.getBean("VdMstrDAO");
	}
}